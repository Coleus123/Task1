package ru.oop.task3;


/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Едет к указанному месту или как можно ближе
     * @param position
     */
    void driveTo(Position position);

}
