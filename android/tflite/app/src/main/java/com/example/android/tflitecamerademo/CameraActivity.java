/* Copyright 2017 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends Activity {

  public static Typeface sCustomFont;
  public static Typeface sStoryFont;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);

    sCustomFont = Typeface.createFromAsset(getAssets(), "font/main_font.ttf");
    sStoryFont = Typeface.createFromAsset(getAssets(), "font/evolve.otf");

    if (null == savedInstanceState) {
      getFragmentManager()
          .beginTransaction()
          .replace(R.id.container, Camera2BasicFragment.newInstance())
          .commit();
    }
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();
    finish();
  }
}
