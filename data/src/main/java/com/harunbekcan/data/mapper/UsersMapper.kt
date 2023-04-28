package com.harunbekcan.data.mapper

import com.harunbekcan.data.model.UserResponseItem
import com.harunbekcan.domain.model.UserUiModel

fun UserResponseItem.toUserUiModel() = UserUiModel(
    email = email.orEmpty(),
    id = id ?: -1,
    name = name.orEmpty(),
    phone = phone.orEmpty(),
    username = username.orEmpty(),
    website = website.orEmpty()
)