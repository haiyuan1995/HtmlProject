package webanim;

import android.view.View;

/**
 * Created by haiyuan 1995 on 2016/8/23.
 */

public class AlphaTransformer extends ABaseTransformer {
    @Override
    protected void onTransform(View view, float position) {
        final float scale = 1f + Math.abs(position);
        view.setAlpha(position < -1f || position > 1f ? 0f : 1f - (scale - 1f));
        if(position == -1){
            view.setTranslationX(view.getWidth() * -1);
        }
    }
}
