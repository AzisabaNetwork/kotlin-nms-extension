package net.azisaba.kotlinnmsextension.v1_20_R1

import net.minecraft.nbt.NBTBase
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.nbt.NBTTagList
import java.util.*

fun NBTTagCompound.getBoolean(key: String): Boolean = q(key)
fun NBTTagCompound.setBoolean(key: String, value: Boolean) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Boolean) = a(key, value)
fun NBTTagCompound.getByte(key: String): Byte = f(key)
fun NBTTagCompound.setByte(key: String, value: Byte) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Byte) = a(key, value)
fun NBTTagCompound.getDouble(key: String): Double = k(key)
fun NBTTagCompound.setDouble(key: String, value: Double) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Double) = a(key, value)
fun NBTTagCompound.getFloat(key: String): Float = j(key)
fun NBTTagCompound.setFloat(key: String, value: Float) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Float) = a(key, value)
fun NBTTagCompound.getLong(key: String): Long = i(key)
fun NBTTagCompound.setLong(key: String, value: Long) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Long) = a(key, value)
fun NBTTagCompound.getInt(key: String): Int = h(key)
fun NBTTagCompound.setInt(key: String, value: Int) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Int) = a(key, value)
fun NBTTagCompound.getShort(key: String): Short = g(key)
fun NBTTagCompound.setShort(key: String, value: Short) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: Short) = a(key, value)
fun NBTTagCompound.getString(key: String): String = l(key)
fun NBTTagCompound.setString(key: String, value: String) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: String) = a(key, value)
fun NBTTagCompound.getList(key: String, type: Int): NBTTagList = c(key, type)
fun NBTTagCompound.getCompound(key: String): NBTTagCompound = p(key)
fun NBTTagCompound.getLongArray(key: String): LongArray = o(key)
fun NBTTagCompound.setLongArray(key: String, value: LongArray) = a(key, value)
fun NBTTagCompound.setLongArray(key: String, value: List<Long>) = c(key, value)
operator fun NBTTagCompound.set(key: String, value: LongArray) = a(key, value)
@JvmName("set_LJ") operator fun NBTTagCompound.set(key: String, value: List<Long>) = c(key, value)
fun NBTTagCompound.getIntArray(key: String): IntArray = n(key)
fun NBTTagCompound.setIntArray(key: String, value: IntArray) = a(key, value)
fun NBTTagCompound.setIntArray(key: String, value: List<Int>) = b(key, value)
operator fun NBTTagCompound.set(key: String, value: IntArray) = a(key, value)
@JvmName("set_IJ") operator fun NBTTagCompound.set(key: String, value: List<Int>) = b(key, value)
fun NBTTagCompound.getByteArray(key: String): ByteArray = m(key)
fun NBTTagCompound.setByteArray(key: String, value: ByteArray) = a(key, value)
fun NBTTagCompound.setByteArray(key: String, value: List<Byte>) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: ByteArray) = a(key, value)
@JvmName("set_BJ") operator fun NBTTagCompound.set(key: String, value: List<Byte>) = a(key, value)
fun NBTTagCompound.getUUID(key: String): UUID = a(key)
fun NBTTagCompound.setUUID(key: String, value: UUID) = a(key, value)
operator fun NBTTagCompound.set(key: String, value: UUID) = a(key, value)
fun NBTTagCompound.hasUUID(key: String): Boolean = b(key)
fun NBTTagCompound.hasKeyOfType(key: String, type: Int): Boolean = b(key, type)
fun NBTTagCompound.contains(key: String): Boolean = e(key)
fun NBTTagCompound.getTagType(key: String): Byte = d(key)
fun NBTTagCompound.remove(key: String) = r(key)
fun NBTTagCompound.copy(): NBTTagCompound = h()
operator fun NBTTagCompound.get(key: String): NBTBase? = c(key)
operator fun NBTTagCompound.set(key: String, value: NBTBase): NBTBase? = a(key, value)
