package com.example.myweather.presentation.root

import com.arkivanov.decompose.ComponentContext

class RootComponentImpl(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext