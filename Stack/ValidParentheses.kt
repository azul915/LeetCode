package codes.Stack

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val map = mapOf('(' to ')', '{' to '}', '[' to ']')
        val stack = Stack<Char>()

        for (i in s.toCharArray()) {
            if (i in map.keys) {
                // 左カッコが来た時
                stack.push(i)
            } else {
                // 左カッコ以外は全て右
                val peek = stack.lastOrNull()
                if (peek != null) {
                    if (i != map[peek]) {
                        return false
                    } else {
                        stack.pop()
                    }
                } else {
                    return false
                }
            }
        }

        if (stack.isEmpty()) {
            return true
        }
        return false
    }
}

// - stackの用意
// - 左カッコが来たらstackに追加
// - 右カッコが来た時、stackに対応する左カッコがなければ「不整合」、対応する左カッコがあるとき、それをpopする
// - 最後までやったときstackが空なら「整合」stackが空じゃなかったら「不整合」