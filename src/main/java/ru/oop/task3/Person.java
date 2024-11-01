package ru.oop.task3;

import java.util.List;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Возвращает транспорт, который находится ближе всего к пользователю
     * @param transports
     */
    Transport getClosestTransport(List<Transport> transports);
}
