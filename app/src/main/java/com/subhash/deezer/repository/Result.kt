package com.subhash.deezer.repository

import com.subhash.deezer.repository.model.BaseResponse

sealed class Result<out R> {
    object Loading : Result<Nothing>()

    data class Error(
        val message: String? = null,
        val error: Throwable? = null
    ) : Result<Nothing>()

    data class Success<out T>(
        val data: T
    ) : Result<T>()
}

fun <T> Result<BaseResponse<T>>.getBaseResponseData(): T? {
    return (this as? Result.Success)?.data?.data
}
