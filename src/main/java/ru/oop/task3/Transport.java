package ru.oop.task3;


/**
 * Реализует различные виды транспорта
 */
public interface Transport extends Positioned {
    /**
     * Проверяет можно ли добраться сразу же до места на транспорте
     * @param position
     * @return
     */
    boolean canDriveTo(Position position);

    /**
     * Едет к указанному месту
     * @param position
     */
    void driveTo(Position position);

    /**
     * Едет как можно ближе к указанному месту
     * @param position
     */
    void driveToTheClosestPlace(Position position);
}
