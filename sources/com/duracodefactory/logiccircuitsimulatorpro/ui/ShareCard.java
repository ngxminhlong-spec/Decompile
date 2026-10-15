package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ShareCard extends LinearLayout {
    public ShareCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int i4;
        int i5;
        int i6;
        super.onFinishInflate();
        double random = Math.random();
        if (random < 0.25d) {
            i4 = R.drawable.ic_startup_third;
            i5 = R.string.timediagrams_title;
            i6 = R.string.welcome_3_d;
        } else if (random < 0.5d) {
            i4 = R.drawable.ic_startup_fourth;
            i5 = R.string.welcome_4_t;
            i6 = R.string.welcome_4_d;
        } else if (random < 0.75d) {
            i4 = R.drawable.ic_startup_fifth;
            i5 = R.string.welcome_5_t;
            i6 = R.string.welcome_5_d;
        } else {
            i4 = R.drawable.ic_startup_sixth;
            i5 = R.string.welcome_6_t;
            i6 = R.string.welcome_6_d;
        }
        ((ImageView) findViewById(R.id.share_card_image)).setImageResource(i4);
        ((TextView) findViewById(R.id.promo_card_title)).setText(i5);
        ((TextView) findViewById(R.id.promo_card_desc)).setText(i6);
        findViewById(R.id.share_card_close).setOnClickListener(new ViewOnClickListenerC0022w(16, this));
    }
}
