package com.example.data.mapper

abstract class Mapper<CLASS_IN, CLASS_OUT> {
    abstract fun transform(item: CLASS_IN?): CLASS_OUT
}
