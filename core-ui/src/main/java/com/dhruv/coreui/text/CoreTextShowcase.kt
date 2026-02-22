/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
private fun CoreTextShowcase() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        CoreText("Heading Large", CoreTextType.HeadingLarge)
        CoreText("Heading Medium", CoreTextType.HeadingMedium)
        CoreText("Heading Small", CoreTextType.HeadingSmall)

        CoreText("Body Large", CoreTextType.BodyLarge)
        CoreText("Body Medium", CoreTextType.BodyMedium)
        CoreText("Body Small", CoreTextType.BodySmall)

        CoreText("Label Large", CoreTextType.LabelLarge)
        CoreText("Label Medium", CoreTextType.LabelMedium)
        CoreText("Label Small", CoreTextType.LabelSmall)
    }
}