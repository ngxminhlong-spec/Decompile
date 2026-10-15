package Y2;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2184a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2185b;
    public final CheckableImageButton c;

    public n(TextInputLayout textInputLayout) {
        this.f2184a = textInputLayout;
        this.f2185b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i4) {
        return true;
    }

    public void c(boolean z4) {
    }
}
