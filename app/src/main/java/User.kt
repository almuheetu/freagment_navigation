import android.os.Parcelable
import java.io.Serializable

data class User(
    val name: String,
    val phoneNumber: String,
    val email: String,
    val address: String
) : Serializable






