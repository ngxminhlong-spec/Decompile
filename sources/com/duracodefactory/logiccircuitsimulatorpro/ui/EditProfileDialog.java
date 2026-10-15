package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.InterfaceC1862g;
import o1.ViewOnClickListenerC1860f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class EditProfileDialog extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1862g f3608o;

    public EditProfileDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getName() {
        return ((EditText) findViewById(R.id.change_name)).getText().toString();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.change_avatar).setOnClickListener(new ViewOnClickListenerC1860f(this, 0));
        findViewById(R.id.ok).setOnClickListener(new ViewOnClickListenerC1860f(this, 1));
        findViewById(R.id.cancel).setOnClickListener(new ViewOnClickListenerC1860f(this, 2));
        findViewById(R.id.back_arrow).setOnClickListener(new ViewOnClickListenerC1860f(this, 3));
    }

    public void setAvatar(Bitmap bitmap) {
        ((ImageView) findViewById(R.id.change_avatar)).setImageBitmap(bitmap);
    }

    public void setListener(InterfaceC1862g interfaceC1862g) {
        this.f3608o = interfaceC1862g;
    }

    public void setName(String str) {
        ((EditText) findViewById(R.id.change_name)).setText(str);
    }
}
