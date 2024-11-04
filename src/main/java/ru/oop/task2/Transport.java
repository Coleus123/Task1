package ru.oop.task2;

/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Едет к указанному месту или к самому ближайшему расположению, указанного пункта назначения
     * @param position
     */
    void driveTo(Position position);

}
