
import com.google.gson.annotations.SerializedName

data class CovidItem(
    @SerializedName("attributes")
    val attributes: Attributes
)