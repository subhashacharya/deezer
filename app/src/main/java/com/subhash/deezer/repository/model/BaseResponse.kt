package com.subhash.deezer.repository.model

data class BaseResponse<T>(val data: T, val total: Int)

