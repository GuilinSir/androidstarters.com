/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package <%= appPackage %>.di.component;

import <%= appPackage %>.di.PerActivity;
import <%= appPackage %>.di.module.ActivityModule;
import <%= appPackage %>.ui.about.AboutFragment;
import <%= appPackage %>.ui.feed.FeedActivity;
import <%= appPackage %>.ui.feed.blogs.BlogFragment;
import <%= appPackage %>.ui.feed.opensource.OpenSourceFragment;
import <%= appPackage %>.ui.login.LoginActivity;
import <%= appPackage %>.ui.main.MainActivity;
import <%= appPackage %>.ui.main.rating.RateUsDialog;
import <%= appPackage %>.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}
