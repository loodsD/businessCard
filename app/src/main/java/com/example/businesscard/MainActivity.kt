package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    firstColumn()
                    secondColumn()
                }
            }
        }
    }
}

@Composable
fun firstColumn(){
    val image = painterResource(R.drawable.logoumt)
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(painter = image, contentDescription = null)

        Text(
            text = "Full Name",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Title",
            fontWeight = FontWeight.Bold,
        )
    }
}
@Composable
fun secondColumn(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom){
        Row(modifier = Modifier.padding(15.dp)){
            Icon(Icons.Rounded.Phone, contentDescription = "Localized description")
            Spacer(Modifier.width(100.dp))
            Text(text = "+00 (00) 000 000",
                 textAlign = TextAlign.Right)
        }
        Row(){
            Icon(Icons.Rounded.AccountBox, contentDescription = "Localized description")
            Spacer(Modifier.width(70.dp))
            Text(text = "@socialMediaHandle",
                 textAlign = TextAlign.Right)
        }
        Row(modifier = Modifier.padding(15.dp)){
            Icon(Icons.Rounded.Email, contentDescription = "Localized description")
            Spacer(Modifier.width(79.dp))
            Text(text = "email@domain.com",
                 textAlign = TextAlign.Right)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
       firstColumn()
        secondColumn()
    }
}