package Y2;

import C0.ViewOnClickListenerC0022w;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import g.AbstractC1678a;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s extends n {
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2214e;

    /* renamed from: f, reason: collision with root package name */
    public final d f2215f;

    public s(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i4 = 2;
        this.d = new a(i4, this);
        this.f2214e = new c(this, i4);
        this.f2215f = new d(this, 2);
    }

    public static boolean d(s sVar) {
        EditText editText = sVar.f2184a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // Y2.n
    public final void a() {
        Drawable a4 = AbstractC1678a.a(this.f2185b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.f2184a;
        textInputLayout.setEndIconDrawable(a4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0022w(10, this));
        LinkedHashSet linkedHashSet = textInputLayout.f12516p0;
        c cVar = this.f2214e;
        linkedHashSet.add(cVar);
        if (textInputLayout.f12521s != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f12524t0.add(this.f2215f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
