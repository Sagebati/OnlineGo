package io.zenandroid.onlinego.data.repositories

import io.zenandroid.onlinego.data.db.GameDao
import io.zenandroid.onlinego.data.model.ogs.SgfGame
import io.zenandroid.onlinego.data.ogs.OGSRestService

class LibraryRepository(
        private val restService: OGSRestService,
        private val dao: GameDao
) {
   fun get_library() {
       restService.library();
   }

    fun upload_sgf() {
        // TODO: sa
    }
}