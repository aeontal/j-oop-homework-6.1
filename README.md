### ProductManager [![Java CI](https://github.com/aeontal/j-oop-homework-6.1/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/aeontal/j-oop-homework-6.1/actions/workflows/maven.yml)

### Задача

Ключевой кейс: при попытке удаления несуществующего объекта генерировалось создаваемое исключение, а не ArrayIndexOfBoundsException

Требования к содержимому:

1. Использовать базовый класс Product и два унаследованных от Product класса: Book  и TShirt. Использовать менеджер и репозиторий 
2. Создать класс исключения NotFoundException отнаследовавшись от RuntimeException и реализовать все конструкторы
3. В методе удаления removeById проводить проверку на наличие элемента

Тестируемая функциональность: написать автотесты на репозиторий: 
	* проверка успешности удаления существующего элемента;
        * генерация NotFoundException при попытке удаления несуществующего элемента

### Решение

1. Разработаны необходимые классы
2. Созданы автотесты.



