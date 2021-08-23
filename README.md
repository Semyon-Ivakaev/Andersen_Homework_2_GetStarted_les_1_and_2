# Домашняя работа Andersen.

Задания старался выполнять в отельных ветках с последующем мёрджем. Пару раз забывал создать ветку
и делал в master ветке, так как код уже был написан. Один раз напоролся на конфлик и пришлось делать
rebase.

# Lesson 1:
[Ссылка на задания](https://developer.android.com/courses/fundamentals-training/toc-v2)

Разделы реализованые в модуле app:

- 1.1: Android Studio and Hello World
- 1.2 Part A: Your first interactive UI
- 1.2 Part B: The layout editor
- 1.4: Learn to help yourself

Домашнее задание реализованы в модуле app, кроме модуля:

- 1.2 Part B: The layout editor - оно выполнено  в модуле homework_p1_2_b

Раздел реализованный в модуле 1_3_textandscrollingviews:

- 1.3: Text and scrolling views

Домашнее задание реализованы в модуле homework_1_3_textandscrollingviews


# Lesson 2:
[Ссылка на задания](https://developer.android.com/courses/fundamentals-training/toc-v2)

Задания разделены по модулям:

- 2_1_activities_and_intents
- 2_2_activity_lifecycle_and_state

Задание "2.3: Implicit intents" разделено на 2 части:

- 2_3_implicit_intents
- 2_3_implicit_intents_receiver

Домашние задания реализованы в отедельных модулях:

- homework_2_1_activities_and_intents
- homework_2_2_activity_lifecycle_and_state

Кроме задания для "2.3: Implicit intents". Оно выполнено в модуле "2_3_implicit_intents"
в том же активите, где и задания из теории.

# Сложности при выполнении ДЗ

Столкнулся с проблемой в модуле 2.3: Implicit intents.

Необходимо было из одного приложения при открытии url запускать не браузер, а приложение-receiver.

Не появлялась возможность выбора приложения, а сразу открывался браузер.

Решено добавление в манифест основного приложения ([ответ был взят тут](https://stackoverflow.com/questions/62535856/intent-resolveactivity-returns-null-in-api-30)):

    <queries>
        <intent>
            <action android:name="android.intent.action.VIEW" />
            <category android:name="android.intent.category.DEFAULT" />
            <category android:name="android.intent.category.BROWSABLE" />
            <data android:scheme="http" android:host="developer.android.com" />
        </intent>
    </queries>
    

