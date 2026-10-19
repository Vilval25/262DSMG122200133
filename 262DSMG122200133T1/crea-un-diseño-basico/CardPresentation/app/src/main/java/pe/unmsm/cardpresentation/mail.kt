package pe.unmsm.cardpresentation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
public val mail: ImageVector
  get() {
    if (_mail != null) {
      return _mail!!
    }
    _mail =
      ImageVector.Builder(
          name = "mail",
          defaultWidth = 24.dp,
          defaultHeight = 24.dp,
          viewportWidth = 24f,
          viewportHeight = 24f,
        )
        .apply {
          path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
          ) {
            moveTo(2f, 20f)
            verticalLineTo(4f)
            horizontalLineTo(22f)
            verticalLineTo(20f)
            horizontalLineTo(2f)
            close()
            moveTo(12f, 13f)
            lineTo(4f, 8f)
            verticalLineTo(18f)
            horizontalLineTo(20f)
            verticalLineTo(8f)
            lineToRelative(-8f, 5f)
            close()
            moveToRelative(0f, -2f)
            lineTo(20f, 6f)
            horizontalLineTo(4f)
            lineToRelative(8f, 5f)
            close()
            moveTo(4f, 8f)
            verticalLineTo(6f)
            verticalLineTo(8f)
            verticalLineTo(18f)
            verticalLineTo(8f)
            close()
          }
        }
        .build()
    return _mail!!
  }

private var _mail: ImageVector? = null
