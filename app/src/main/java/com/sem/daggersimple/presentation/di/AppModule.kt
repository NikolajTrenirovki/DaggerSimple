package com.sem.daggersimple.presentation.di

import com.sem.daggersimple.data.StringRepository
import com.sem.daggersimple.domain.StringUseCase
import com.sem.daggersimple.presentation.StringViewModel
import dagger.Module
import dagger.Provides

@Module
object AppModule {

/*    @Provides
    fun provideString() {

    }*/


    // в видео https://www.youtube.com/watch?v=xif-1cnSHxs&list=PL0SwNXKJbuNkYFUda5rlA-odAVyWItRCP&index=3&ab_channel=AndroidBroadcast.%D0%92%D1%81%D0%B5%D0%BE%D0%B1%D0%90%D0%BD%D0%B4%D1%80%D0%BE%D0%B8%D0%B4%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B5
    // методы с @Provides удалялись, после добавления в классы @Inject constructor
    @Provides
    fun provideStringViewModel(stringUseCase: StringUseCase) : StringViewModel {

        return StringViewModel(stringUseCase)

    }

    @Provides
    fun provideStringUseCase(repository: StringRepository) : StringUseCase {
        return StringUseCase(repository)
    }

    @Provides
    fun provideStringRepository() : StringRepository {
        return StringRepository()
    }

}