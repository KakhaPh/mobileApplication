package com.project.cryptocurrencyapp.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.project.cryptocurrencyapp.data.dto.TeamMember
import com.project.cryptocurrencyapp.ui.theme.mainColor
import com.project.cryptocurrencyapp.ui.theme.whiteColor

@Composable
fun TeamListItem (
    teamMember: TeamMember,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.headlineSmall,
            color = mainColor
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.bodyMedium,
            fontStyle = FontStyle.Italic,
            color = whiteColor
        )
    }
}