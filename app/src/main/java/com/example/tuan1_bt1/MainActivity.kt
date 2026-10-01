package com.example.tuan1_bt1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tuan1_bt1.ui.theme.Tuan1_bt1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuan1_bt1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Thanh công cụ chứa nút Back và Edit
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { /* Xử lý sự kiện nút back */ }) {
                // Đã sửa lại: Gọi icon ic_back từ thư mục drawable của bạn
                Icon(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back")
            }
            IconButton(onClick = { /* Xử lý sự kiện nút edit */ }) {
                // Đã sửa lại: Gọi icon ic_edit từ thư mục drawable của bạn
                Icon(painter = painterResource(id = R.drawable.ic_edit), contentDescription = "Edit")
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Ảnh đại diện
        Image(
            painter = painterResource(id = R.drawable.avatar), // Đảm bảo file avatar của bạn đúng tên này
            contentDescription = "Avatar",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Tên sinh viên
        Text(
            text = "Nguyễn Nhật Tiến", // Sửa thành tên của bạn nhé
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        // MSSV
        Text(
            text = "MSSV: 051205001350", // Sửa thành mã số sinh viên của bạn
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}