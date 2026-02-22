/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.text

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.fromHtml

internal fun parseHtmlText(html: String): AnnotatedString {
    return AnnotatedString.fromHtml(html)
}