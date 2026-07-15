package com

class WiseSaying (val id: Int, var content: String, var writer: String){
    fun update(newContent: String, newWriter: String) {
        content = newContent
        writer = newWriter
    }
}