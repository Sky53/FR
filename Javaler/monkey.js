// ==UserScript==
// @name Ogame spy helper
// @namespace http://tampermonkey.net/
// @version 0.1
// @description try to take over the world!
// @author You
// @match https://*.gameforge.com/game/index.php?page=galaxy
// @grant none
// ==/UserScript==
(function() {
    let SETTINGS = {
        COMBUSTION_DRIVE: 9,
        UNIVERSE_FLEET_SPEED_ACCELERATION: 1,
        PROBE_BASE_SPEED: 100000000,
        DELAY_BETWEEN_PROB: 2,


    };

    $("#spyMain").remove();
    let mainDiv = document.createElement('div');
    mainDiv.id = 'spyMain';
    mainDiv.className = 'block';
    mainDiv.style.cssText = 'margin-left: 7pt;';

    $("#contentWrapper").append(mainDiv);
    let mainInput = document.createElement('textarea');
    mainInput.id = 'spyInput';
    mainDiv.appendChild(mainInput);

    let spyTimerDisplay = document.createElement('span');
    spyTimerDisplay.id = 'spyTimerDisplay';
    spyTimerDisplay.style.cssText = 'display: block;';
    mainDiv.appendChild(spyTimerDisplay);

    function calcFlyDistance(galaxy, system, position) {
        if (galaxy !== currentGalaxy) {
            return Math.round(Math.abs(20000 * (galaxy - currentGalaxy)))
        }
        if (system !== currentSystem) {
            return Math.round(Math.abs(2700 + 95 * (system - currentSystem)))
        }
        if (position !== currentPosition) {
            return Math.round(Math.abs(1000 + 5 * (position - currentPosition)))
        }
    }



    function calcFlyTimeToOneWay(galaxy, system, position) {
        let distance = calcFlyDistance(galaxy, system, position);
        return Math.ceil(10 + 3500(Math.sqrt(10 distance / (SETTINGS.PROBE_BASE_SPEED * ((SETTINGS.COMBUSTION_DRIVE / 10) + 1)))) / SETTINGS.UNIVERSE_FLEET_SPEED_ACCELERATION);
    }


    function buildSpyPlan(allCordsWithFlyTime, leftSlots) {
        let arrayOfSpeedRoad = [];
        for (let i = 0; i < leftSlots; i++) {
            arrayOfSpeedRoad.push([]);
        }

        var counter = 0;
        for (let flyTimeIdx in allCordsWithFlyTime) {
            let flyTime = allCordsWithFlyTime[flyTimeIdx];
            if (counter >= arrayOfSpeedRoad.length) {
                counter = 0;
            }
            let bucket = arrayOfSpeedRoad[counter++];
            let duration = flyTime.timeToOneWay * 2;
            if (Object.keys(bucket).length == 0) {
                bucket.push({
                    coordinates: flyTime.coordinates,
                    delay: 0,
                    duration: duration
                })
            } else {
                let lastElement = bucket[bucket.length - 1];
                bucket.push({
                    coordinates: flyTime.coordinates,
                    delay: lastElement.duration + SETTINGS.DELAY_BETWEEN_PROB + lastElement.delay,
                    duration: duration
                })
            }
        }

        let allFlyPlan = [];
        for (key in arrayOfSpeedRoad) {
            for (key2 in arrayOfSpeedRoad[key]) {
                allFlyPlan.push(arrayOfSpeedRoad[key][key2]);
            }
        }
        allFlyPlan.sort(function(a, b) {
            return a.delay - b.delay;
        });


        shouldContinue = true;
        while (shouldContinue) {
            shouldContinue = false;
            for (let i = 1; i < allFlyPlan.length; i++) {
                let current = allFlyPlan[i - 1];
                let next = allFlyPlan[i];
                if (Math.abs(current.delay - next.delay) < SETTINGS.DELAY_BETWEEN_PROB) {
                    shouldContinue = true;
                    for (let j = i; j < allFlyPlan.length; j++) {
                        allFlyPlan[j].delay = allFlyPlan[j].delay + SETTINGS.DELAY_BETWEEN_PROB;
                    }
                    allFlyPlan.sort(function(a, b) {
                        return a.delay - b.delay;
                    });
                    break
                }
            }
        }

        return allFlyPlan;
    }

    $('#spyInput').keydown(function(e) {
        if (e.ctrlKey && e.keyCode === 13) {
            let slots = $("#slotValue").text().trim().split("/");
            let activeSlots = parseInt(slots[0]);
            let allSlots = parseInt(slots[1]);
            let leftSlots = allSlots - activeSlots;
            if (leftSlots === 0) {
                $("#spyTimerDisplay").text("there is no fly slots");
                return
            }
            let currentGalaxyArr = $(".planetlink.active >.planet-koords").text().replace("[", "").replace("]", "").split(":");
            let currentGalaxy = parseInt(currentGalaxyArr[0]);
            let currentSystem = parseInt(currentGalaxyArr[1]);
            let currentPosition = parseInt(currentGalaxyArr[2]);
            console.info("leftSlots=" + leftSlots + " currentPlanet=[" + currentGalaxy + ":" + currentSystem + ":" + currentPosition + "]" + " combustionDrive=" + SETTINGS.COMBUSTION_DRIVE);
            var timerDelaySec = 0;

            let inputLines = e.target.value.split(/\r?\n/);
            let allCordsWithFlyTime = [];
            for (const line of inputLines) {
                if (line.trim().length === 0) {
                    continue
                }
                let cords = line.replace(/[^0-9:]/g, "").split(":");
                let galaxy = parseInt(cords[0]);
                let system = parseInt(cords[1]);
                let position = parseInt(cords[2]);
                timerDelaySec = timerDelaySec + 3;
                let timeToFly = calcFlyTimeToOneWay(galaxy, system, position);
                allCordsWithFlyTime.push({
                    timeToOneWay: timeToFly,
                    coordinates: {
                        galaxy: galaxy,
                        system: system,
                        position: position
                    }
                })
            }
            allCordsWithFlyTime.sort(function(a, b) {
                return a.timeToOneWay - b.timeToOneWay;
            });
            let allFlyPlan = buildSpyPlan(allCordsWithFlyTime, leftSlots);
            console.log("allFlyPlan = " + JSON.stringify(allFlyPlan));
            for (var i = 0; i < allFlyPlan.length; i++) {
                let plan = allFlyPlan[i];
                setTimeout(function() {
                    console.info("Send: " + plan.coordinates.galaxy + ":" + plan.coordinates.system + ":" + plan.coordinates.position);
                    sendShips(6, plan.coordinates.galaxy, plan.coordinates.system, plan.coordinates.position, 1, 1)
                }, plan.delay * 1000);
            }


            let endOfTimer = new Date().getTime() + allFlyPlan[allFlyPlan.length - 1].delay * 1000;
            let timer = setInterval(function() {
                let secondsLeft = endOfTimer - new Date().getTime();
                $("#spyTimerDisplay").text(Math.round(secondsLeft / 1000) + " left seconds");
            }, 1000);
            setTimeout(function() {
                clearInterval(timer);
                $("#spyTimerDisplay").text("complicate");
            }, endOfTimer - new Date().getTime() + 1000);
        }
    });
})();