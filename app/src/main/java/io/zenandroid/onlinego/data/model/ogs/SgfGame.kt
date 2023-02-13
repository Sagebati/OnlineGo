package io.zenandroid.onlinego.data.model.ogs

import java.util.Date

data class SgfGame(
        var id: Long? = null,
        var game_id: Long? = null,
        var date: Date,
        var date_2: Date,
        var date_3: Date,
        var filename: String,
        var a_bool: Boolean = false,
        var misc: Unit? = null,
        var komi: Double = 0.0,
        var black_player_name: String? = null,
        var misc_int: Int = 0,
        var white_player_name: String? = null,
        var misc_int2: Int = 0,
        var misc_bool: Boolean = false,
        var misc_bool2: Boolean = false,
        var misc_bool3: Boolean = false,
        var result: String? = null,
)