@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package kotlinproject.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val avatar: StringResource by 
      lazy { init_avatar() }
}

internal val Res.string.avatar: StringResource
  get() = CommonMainString0.avatar

private fun init_avatar(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:avatar", "avatar",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kotlinproject.composeapp.generated.resources/values/strings.commonMain.cvr",
    10, 42),
    )
)
