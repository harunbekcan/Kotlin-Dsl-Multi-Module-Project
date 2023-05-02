package com.harunbekcan.feature.fragment

import android.os.Bundle
import com.harunbekcan.feature.base.BaseFragment
import com.harunbekcan.feature.databinding.FragmentUsersBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersFragment : BaseFragment<FragmentUsersBinding>(FragmentUsersBinding::inflate) {

    override fun prepareView(savedInstanceState: Bundle?) {
    }

}