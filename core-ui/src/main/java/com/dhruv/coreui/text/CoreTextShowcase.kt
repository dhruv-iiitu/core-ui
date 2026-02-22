/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.text


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dhruv.coreui.theme.CoreTheme

@Composable
private fun CoreTextShowcaseContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CoreTheme.colors.background)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // 🔹 Headings
        CoreText("Headings", CoreTextType.HeadingMedium)
        Divider()

        CoreText("Heading Large", CoreTextType.HeadingLarge)
        CoreText("Heading Medium", CoreTextType.HeadingMedium)
        CoreText("Heading Small", CoreTextType.HeadingSmall)

        Spacer(modifier = Modifier.height(8.dp))

        // 🔹 Body
        CoreText("Body", CoreTextType.HeadingMedium)
        Divider()

        CoreText("Body Large", CoreTextType.BodyLarge)
        CoreText("Body Medium", CoreTextType.BodyMedium)
        CoreText("Body Small", CoreTextType.BodySmall)

        Spacer(modifier = Modifier.height(8.dp))

        // 🔹 Label
        CoreText("Labels", CoreTextType.HeadingMedium)
        Divider()

        CoreText("Label Large", CoreTextType.LabelLarge)
        CoreText("Label Medium", CoreTextType.LabelMedium)
        CoreText("Label Small", CoreTextType.LabelSmall)

        Spacer(modifier = Modifier.height(16.dp))

        Divider()

        // 🔹 Semantic Colors Showcase
        CoreText(
            text = "Primary Color",
            type = CoreTextType.BodyMedium,
            color = CoreTheme.colors.primary
        )

        CoreText(
            text = "Success Color",
            type = CoreTextType.BodyMedium,
            color = CoreTheme.colors.success
        )

        CoreText(
            text = "Error Color",
            type = CoreTextType.BodyMedium,
            color = CoreTheme.colors.error
        )

        CoreText(
            text = "Warning Color",
            type = CoreTextType.BodyMedium,
            color = CoreTheme.colors.warning
        )

        Divider()

        CoreText(
            text = "<b>Bold</b> and <i>Italic</i> and <font color='#FF0000'>Red</font>",
            type = CoreTextType.BodyMedium,
            isHtml = true
        )
    }
}

@Preview(showBackground = true, name = "CoreUI - Light")
@Composable
private fun CoreTextPreviewLight() {
    CoreTheme(darkTheme = false) {
        CoreTextShowcaseContent()
    }
}

@Preview(showBackground = true, name = "CoreUI - Dark")
@Composable
private fun CoreTextPreviewDark() {
    CoreTheme(darkTheme = true) {
        CoreTextShowcaseContent()
    }
}