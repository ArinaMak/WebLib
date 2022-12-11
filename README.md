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
- [X] Синхронизовать базу данных с NodeJS
- [X] Синхронизация с сервером

__Практический этап__
- [X] Начать реализовывать необходимые функции приложения
- [X] Начать реализовывать регистрацию/авторизации пользователя
- [X] Проработать интуитивно простой, понятный и привлекательрный для пользователя фронтенд

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
* backend - nodeJS (Фреймворк - Express)
* frontend - React
_____
## Предварительный список функций, доступных авторизованному пользователю

- [ ] Добавление пользователем книг на электронную полку
- [ ] Удаление пользователем книг со своей полки
- [ ] Поиск книг по всей библиотеке
     - [ ] Поиск по названию
     - [ ] Поиск по автору
     - [ ] Поиск по издательству
     - [ ] Поиск по разделу
- [ ] Просмотр своей полки (свои книги, которые не отдали и книги, которые получили от других)
- [ ] Просмотр чужих книг (книги, полученные от других)
- [ ] Просмотр списка одолженных книг (книги, отданные другим пользователям)
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

файл client:
- public
- src - реализация
    - API - реализация серверов
        - book 
            - BookService.js - сервер "книги"
        - registration
            - RegistrationService.js - сервер "регистрация"
        - section
            - SectionService.js - сервер "разделы" (1 вариант)
            - SectionService2.js - сервер "разделы" (2 вариант)
    - components
        - UI
            - button
                - MyButton.jsx - определение MyButton 
                - MyButton.module.css - стиль для MyButton
            - input
                - MyInput.jsx - определение MyInput 
                - MyInput.module.css - стиль для MyInput
            - Loader
                - Loader.jsx - определение Loader
                - Loader.module.css - стиль для Loader
            - Navbar
                - Navbar.jsx - определение Navbar
            - pagination
                - Pagination.jsx - определение Pagination
            - select
                - MySelect.jsx - определение MySelect
        - AppRouter.jsx
        - BookItem.jsx - шаблон для отрисовки "книги" с полями индекс, название, описание, кнопка "Открыть" и "Одолжить"
        - BookList.jsx
    - context
        - index.js 
    - hooks
        - useBooks.js 
        - useFetching.js 
        - useObserver.js
        - usePosts.js
    - pages - страницы
        - About.jsx - стрница опсиания сайта
        - Books.jsx - страница всех книг
        - Bookshelf.jsx - страница добавление новой книги
        - BookshelfBooks.jsx
        - Error.jsx - страница ошибки
        - Login.jsx - страница авторизации
        - Signin.jsx - страница решистрации
    - router
        - index.js - описание путей
    - styles
        - App.css - стили
    - utils
        - pages.js - для подсчёта страниц 
    - App.js - 
    - index.css
    - index.js
- package-lock.json
- package.json

файл server
- config
    - default.json - начальное значение порта
- app.js
- books.js - получение данных всех "книг"
- connectingToDB.js - подключение к MySQL
- index.js - начальная страница
- package-lock.json - пакеты
- package.json - пакеты
                

![Страница About](https://github.com/ArinaMak/WebLib/blob/main/2022-12-11_20-32-19.png)
![Страница регистрации](https://github.com/ArinaMak//WebLib/blob/main/2022-12-11_20-32-11.png)
![Страница всех книг](https://github.com/ArinaMak/WebLib/blob/main/2022-12-11_20-32-02.png)
![Страница авторизации](https://github.com/ArinaMak//WebLib/blob/main/2022-12-11_20-31-39.png)




## Описание базы данных

![База данных](https://github.com/ArinaMak/WebLib/blob/main/data_base_web_lib.png)

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
