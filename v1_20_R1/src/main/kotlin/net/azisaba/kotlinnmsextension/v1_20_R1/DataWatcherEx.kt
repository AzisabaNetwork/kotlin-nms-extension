package net.azisaba.kotlinnmsextension.v1_20_R1

import net.minecraft.network.syncher.DataWatcher
import net.minecraft.network.syncher.DataWatcherObject

fun <T> DataWatcher.register(key: DataWatcherObject<T>, value: T) = a(key, value)
operator fun <T> DataWatcher.set(key: DataWatcherObject<T>, value: T) = b(key, value)
fun <T> DataWatcher.set(key: DataWatcherObject<T>, value: T, forceUpdate: Boolean) = a(key, value, forceUpdate)
fun DataWatcher.packDirty(): MutableList<DataWatcher.b<*>>? = b()
fun DataWatcher.getNonDefaultValues(): MutableList<DataWatcher.b<*>>? = c()
