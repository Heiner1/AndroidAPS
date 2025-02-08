package app.aaps.core.keys.interfaces

import java.util.Locale

/**
 * Preference key where key is a format string see [String::format]
 *
 * Final key is composed as key + String.format(Locale.ENGLISH, format, *arguments)
 */
interface IntComposedNonPreferenceKey : NonPreferenceKey {

    /**
     * Key is used as prefix for recognizing the preference
     *
     * Final key is composed as key + String.format(Locale.ENGLISH, format, *arguments)
     */
    override val key: String

    /**
     * String used to format vararg
     */
    val format: String

    /**
     * Default value
     */
    val defaultValue: Int

    /**
     * Compose final key from arguments
     */
    fun composeKey(vararg arguments: Any): String = String.format(Locale.ENGLISH, key + format, *arguments)
}