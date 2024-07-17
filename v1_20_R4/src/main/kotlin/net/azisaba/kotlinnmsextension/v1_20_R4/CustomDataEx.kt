@file:Suppress("NOTHING_TO_INLINE")

package net.azisaba.kotlinnmsextension.v1_20_R4

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.world.item.component.CustomData

inline val CustomData.size: Int
    inline get() = a()
inline val CustomData.isEmpty: Boolean
    inline get() = b()
inline fun CustomData.getUnsafe(): NBTTagCompound = d()
inline fun CustomData.contains(key: String): Boolean = a(key)
inline fun CustomData.copyTag(): NBTTagCompound = c()
inline fun CustomData.update(noinline action: (NBTTagCompound) -> Unit): CustomData = a(action)
