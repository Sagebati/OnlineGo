package io.zenandroid.onlinego.ui.items.statuschips

import android.view.View
import androidx.annotation.DrawableRes
import android.view.View.GONE
import android.view.View.VISIBLE
import com.xwray.groupie.viewbinding.BindableItem
import io.zenandroid.onlinego.R
import io.zenandroid.onlinego.databinding.ViewChipBinding

open class Chip(
        var text: String,
        @DrawableRes val icon: Int? = null,
        val onClick: (() -> Unit)? = null
) : BindableItem<ViewChipBinding>(text.hashCode().toLong()) {
    override fun bind(binding: ViewChipBinding, position: Int) {
        binding.text.text = text
        icon?.let {
            binding.icon.visibility = VISIBLE
            binding.icon.setImageResource(it)
        } ?: run { binding.icon.visibility = GONE }

    }

    override fun getLayout() = R.layout.view_chip

    override fun equals(other: Any?): Boolean {
        return other is Chip && other.text == text && other.icon == icon
    }

    override fun hashCode(): Int {
        var result = text.hashCode()
        result = 31 * result + (icon ?: 0)
        return result
    }

    override fun initializeViewBinding(view: View): ViewChipBinding = ViewChipBinding.bind(view)
}

class FinishedChip(onClick: (() -> Unit)? = null) : Chip("Finished", R.drawable.ic_question_mark, onClick = onClick)
class PlayingChip(onClick: (() -> Unit)? = null) : Chip("Playing", R.drawable.ic_question_mark, onClick = onClick)
class StoneRemovalChip(onClick: (() -> Unit)? = null) : Chip("Scoring", R.drawable.ic_question_mark, onClick = onClick)
class PassedChip(onClick: (() -> Unit)? = null) : Chip("Player Passed", R.drawable.ic_question_mark, onClick = onClick)
class AnalysisChip(onClick: (() -> Unit)? = null) : Chip("Analysis", R.drawable.ic_question_mark, onClick = onClick)
class EstimationChip(onClick: (() -> Unit)? = null) : Chip("Estimation", R.drawable.ic_question_mark, onClick = onClick)