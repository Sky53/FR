package Javaler.modi;

public class Tiger extends Cat implements HasSize, HasWeight {
    @Override
    public int getValue() {
        return 115;
    }

    @Override
    protected String getName() {
        return"Василий Тигранович";
    }
}
