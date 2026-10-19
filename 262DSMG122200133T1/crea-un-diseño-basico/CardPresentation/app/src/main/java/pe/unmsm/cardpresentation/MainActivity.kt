package pe.unmsm.cardpresentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.unmsm.cardpresentation.ui.theme.CardPresentationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardPresentationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardPresentationApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CardPresentationApp(modifier: Modifier = Modifier) {
    BackGround()
    CardPresentation(
        name = stringResource(R.string.name),
        role = stringResource(R.string.role),
        phoneNumber = stringResource(R.string.phone_number),
        email = stringResource(R.string.email),
        modifier = modifier
    )
}

@Composable
fun BackGround(modifier: Modifier = Modifier) {
    Image(
        contentDescription = null,
        painter = painterResource(R.drawable.bg_presentacion),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxSize()
    )
}

@Composable
fun CardPresentation(name: String, role: String, phoneNumber: String, email: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            contentDescription = null,
            painter = painterResource(R.drawable.android_logo),
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042), shape = RoundedCornerShape(16.dp))
        )
        Text(
            text = name,
            modifier = Modifier.padding(top = 8.dp),
            fontSize = 32.sp,
            fontFamily = FontFamily.Serif
        )
        Text(
            text = role,
            fontSize = 12.sp,
            color = Color(0xFF073042)
        )
        Spacer(
            modifier = Modifier.height(height = 36.dp)
        )
        Row {
            Icon(
                contentDescription = "Teléfono",
                imageVector = call
            )
            Spacer(
                modifier = Modifier.width(width = 8.dp)
            )
            Text(
                text = phoneNumber
            )
        }
        Row {
            Icon(
                contentDescription = "Email",
                imageVector = mail
            )
            Spacer(
                modifier = Modifier.width(width = 8.dp)
            )
            Text(
                text = email
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPresentationAppPreview() {
    CardPresentationTheme {
        CardPresentationApp()
    }
}