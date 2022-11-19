# __WebLib__

Web-приложение для обмена книгами _(book sharing)_.
_____
## Описание
  Простое и удобное приложение, в котором каждый авторизированный пользователь может добавить на свою электронную полку 
имеющиеся у него книги, а также одолжить или обменяться книгами с другими пользователями. 
_____
## To do list:

__Начальный этап__
- [X] Определиться с темой проекта
- [X] Составить краткое описание того, как будет выглядеть готовый проект

__Подготовка и сбор материалов__
- [X] Продумать функционал, который будет предоставлять приложение
- [X] Узнать о frontend, backend, серверах и их синхронизации
- [X] Определиться с инструментами, с помощью которых будет происходить реализация проекта
- [X] Изучить Java, пройдя курс на Stepic
- [X] Создать базу данных
- [X] Синхронизовать базу данных с IDE
- [X] Синхронизация с сервером

__Практический этап__
- [X] Начать реализовывать необходимые функции приложения
- [X] Начать реализовывать регистрацию/авторизации пользователя
- [ ] Проработать интуитивно простой, понятный и привлекательрный для пользователя фронтенд

__Контроль и корректировка__
- [ ] Протестировать приложение
- [ ] Исправить выявленные баги и ошибки
- [ ] При наличии времени реализовать необязательные(дополнительные) функции
- [ ] Тестировка и исправление багов

__Заключительный этап__
- [ ] Представить законченный проект аудитории
_____
## Инструменты, выбранные для реализации проекта:

* База данных - _MySQL_
* Поднятие кода на сервере - _Apache Tomcat_
* backend - _Java в Eclipse_ (возможен переход на go)
* frontend - _HTML/JavaScript_ (возможно использование React)
_____
## Предварительный список функций, доступных авторизованному пользователю

- [ ] Добавление пользователем книг на электронную полку
- [ ] Удаление пользователем книг со своей полки
- [ ] Поиск книг по всей библиотеке
     - [ ] Поиск по названию
     - [ ] Поиск по автору
     - [ ] Поиск по издательству
     - [ ] Поиск по разделу
- [ ] Просмотр своей полки
- [ ] Просмотр чужой полки
- [ ] Просмотр списка одолженных книг
- [ ] Редактировать информацию о книге
- [ ] Просмотр профиля
- [ ] Редактирование профиля
- [ ] Одолжить книгу
  
## Список дополнительных функций (выполняется, если остается время):

- [ ] Оповещение пользователя о том, что нужно вернуть книгу
- [ ] Реализация небольшого чатика между пользователями для упрощения взаимодействия
_____
## Описание проделанной работы
В разработке(в будущем будет переделываться, исправляться ошибки, наводиться порядок в коде). Данные файлы являются основой для дальнейшего развития кода.

- home.jsp - начальная страница
- My_servlet.java (My_servlet.class) - обработка переходов
- my_base_class.java(my_base_class.cass) - подключение к Базе Данных
- Start.jsp End.jsp - основные элементы, которые повторяются
- BD_Book.jsp - выводит таблицу всех книг
- signin.jsp - страница регистрации
- home.css style.css - стили

![About_jsp](https://github.com/ArinaMak/WebLib/blob/main/About_jsp.JPG)
![home_jsp](https://github.com/ArinaMak/WebLib/blob/main/home_jsp.JPG)
![signin_jsp](https://github.com/ArinaMak/WebLib/blob/main/signin_jsp.JPG)




## Описание базы данных

![База данных](https://github.com/ArinaMak/WebLib/blob/main/data_base_web_lib.JPG)

### __Таблицы:__ 
1. Книги (содержит все книги, которые есть в общей базе)
2. Авторы (содержит всех авторов, занесенных в базу)
3. Автор-книга (т.к. у одной книги может быть несколько авторов, таблица значительно упростит поиск по автору)
4. Пользователи (содержит информацию обо всех авторизованных пользователях)
5. Книга-пользователь (содержит информацию о том, какая книга есть у какого пользователя)
6. Выдача (показывает, какой пользователь у кого одолжил книгу)
### __Дополнительные таблицы:__
1. Разделы (прим. - естественные науки, технические науки, художественная литература и т.д.)
2. Издательства
3. Станции метро (для указания места встречи, где можно одолжить/обменяться книгами)

_____
### __Более подробное описание таблиц:__

__Книги__ ___(book)___
* уникальный номер книги _(id_book)_
* название _(title)_
* описание _(description)_
* раздел _(section)_
* издательство _(publishing_house)_
* год выпуска _(year_of_publication)_
* общее количество _(quantity_of_total)_
* количество книг, которые свободны _(quantity_left)_

__Авторы__ ___(author)___

* уникальный номер автора _(id_author)_
* имя _(name)_
* фамилия _(surname)_
* отчество _(middle_name)_

__Автор-книга__ ___(author_book)___

* уникальный номер сочетания _(id_author_book)_
* уникальный номер автора _(id_author)_
* уникальный номер книги _(id_book)_

__Пользователи__ ___(user)___

* уникальный номер пользователя _(id_user)_
* имя _(name)_
* фамилия _(surname)_
* отчество _(middle_name)_
* логин _(login)_
* электронная почта _(email)_
* статус электронной почты _(email_status)_
* пароль _(password)_
* количество книг на электронной полке _(number_of_books)_
* количество книг одолжено _(number_of_books_taken)_

__Книга-пользователь__ ___(book_user)___

* уникальный номер сочетания _(id_book_user)_
* уникальный номер книги _(id_book)_
* уникальный номер пользователя _(id_user)_
* уникальный номер станции метро _(id_metro_station)_
* статус книги-есть ли на полке _(there_is)_
* цена за порчу/потерю книги _(price_of_loss)_

__Выдача__ ___(issuance)___

* уникальный номер сочетания _(id_issuance)_
* уникальный номер сочетания книги и пользователя(владельца) _(id_book_user)_
* уникальный номер пользователя, который берет книгу _(id_user)_
* дата выдачи книги _(date_of_issue)_
* оговоренная дата возврата книги _(required_return_date)_
* фактическая дата возврата _(return_date)_
* количество просроченных дней _(expired_on)_

__Разделы__ ___(section)___

* уникальный номер раздела _(id_section)_
* название раздела _(section)_

__Издательства__ ___(publishing_house)___

* уникальный номер издательства _(id_publishing_house)_
* название издательства _(title)_
* город _(city)_

__Станции метро__ ___(metro_station)___

* уникальный номер станции метро _(id_metro_station)_
* название станции метро _(name)_
