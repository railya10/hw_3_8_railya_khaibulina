package com.example.hw_3_8_railya_khaibulina

import java.io.Serializable

data class Character(
    var status_: String,
    var name_: String,
    var image_: Int
)
    : Serializable //нажимаем на фрагмент (второй фрагмент), в котором будут приниматься данные
                    // в attributes добавляем argument в списке выбираем serializable
                    // происходит автопоиск serializable, который указан здесь
