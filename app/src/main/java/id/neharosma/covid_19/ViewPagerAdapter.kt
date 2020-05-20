package id.neharosma.covid_19

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 3
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return HomeFragment() }
            1 -> { return PenjelasanFragment() }
            2 -> { return AkunUserFragment() }
            else -> {
                return AkunUserFragment()
            }
        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}
