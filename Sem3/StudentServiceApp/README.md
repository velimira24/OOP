Задания:
1 Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
2 Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов через for на кансоль
3 Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль

Так же ранее были созданы классы юзера, учителя, студентов. Был реализован итератор списка студентов, а также их сортировка

1 Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс iUserService. Добавить метод вывода списка учителей отсортированного обобщенным классом UserComparator
2 Создать класс TeacherController. Подключить к классу обобщенный интерфейс iUserController.
3 Разработать обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников. Вывести результат работы класса на консоль.