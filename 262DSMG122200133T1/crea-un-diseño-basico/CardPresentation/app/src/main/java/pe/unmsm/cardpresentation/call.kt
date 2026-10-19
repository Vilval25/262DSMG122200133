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
public val call: ImageVector
  get() {
    if (_call != null) {
      return _call!!
    }
    _call =
      ImageVector.Builder(
          name = "call",
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
            moveTo(19.95f, 21f)
            quadToRelative(-3.13f, 0f, -6.19f, -1.35f)
            reflectiveQuadTo(8.2f, 15.8f)
            reflectiveQuadTo(4.35f, 10.25f)
            reflectiveQuadTo(3f, 4.05f)
            verticalLineTo(3f)
            horizontalLineTo(8.9f)
            lineTo(9.83f, 8.02f)
            lineTo(6.98f, 10.9f)
            quadToRelative(0.55f, 0.98f, 1.23f, 1.85f)
            reflectiveQuadToRelative(1.45f, 1.63f)
            quadToRelative(0.72f, 0.72f, 1.59f, 1.39f)
            quadTo(12.1f, 16.43f, 13.1f, 17f)
            lineTo(16f, 14.1f)
            lineToRelative(5f, 1.03f)
            verticalLineTo(21f)
            horizontalLineTo(19.95f)
            close()
            moveTo(6.03f, 9f)
            lineTo(7.68f, 7.35f)
            lineTo(7.25f, 5f)
            horizontalLineTo(5.03f)
            quadTo(5.15f, 6.13f, 5.4f, 7.11f)
            reflectiveQuadTo(6.03f, 9f)
            close()
            moveToRelative(8.95f, 8.95f)
            quadToRelative(1f, 0.43f, 2.01f, 0.68f)
            reflectiveQuadTo(19f, 18.95f)
            verticalLineToRelative(-2.2f)
            lineTo(16.65f, 16.27f)
            lineToRelative(-1.68f, 1.68f)
            close()
            moveTo(6.03f, 9f)
            close()
            moveToRelative(8.95f, 8.95f)
            close()
          }
        }
        .build()
    return _call!!
  }

private var _call: ImageVector? = null
