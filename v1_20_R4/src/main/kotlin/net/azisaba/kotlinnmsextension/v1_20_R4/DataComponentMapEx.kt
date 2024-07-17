@file:Suppress("NOTHING_TO_INLINE")

package net.azisaba.kotlinnmsextension.v1_20_R4

import net.minecraft.core.component.DataComponentMap
import net.minecraft.core.component.DataComponentType

inline val DataComponentMap.size: Int
    inline get() = d()
inline val DataComponentMap.isEmpty: Boolean
    inline get() = e()
inline operator fun <T> DataComponentMap.get(type: DataComponentType<out T>): T? = a(type)
inline fun <T> DataComponentMap.getOrDefault(type: DataComponentType<out T>, defaultValue: T): T = a(type, defaultValue)
inline fun DataComponentMap.has(type: DataComponentType<*>): Boolean = b(type)
inline fun DataComponentMap.keySet(): Set<DataComponentType<*>> = b()
