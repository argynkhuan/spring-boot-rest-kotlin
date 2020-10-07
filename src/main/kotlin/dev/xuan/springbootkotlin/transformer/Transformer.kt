package dev.xuan.springbootkotlin.transformer

interface Transformer <A, B>{
    fun transformer(source: A): B
}