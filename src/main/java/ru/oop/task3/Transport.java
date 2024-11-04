package ru.oop.task3;


/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Едет к указанному месту
     * @param position
     */
    void driveTo(Position position);

}
