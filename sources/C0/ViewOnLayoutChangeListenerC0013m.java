package C0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import l.M0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0013m implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f345b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0013m(int i4, Object obj) {
        this.f344a = i4;
        this.f345b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        switch (this.f344a) {
            case 0:
                D d = (D) this.f345b;
                if (i6 - i4 > 0) {
                    i1.d dVar = d.f198g0;
                    float f4 = dVar.f13265i;
                    float f5 = dVar.f13266j;
                    if (f4 != 0.0f) {
                        d.f202i0.setScrollXModel(f4);
                    }
                    if (f5 != 0.0f) {
                        d.f202i0.setScrollYModel(f5);
                    }
                    d.f202i0.removeOnLayoutChangeListener(this);
                    return;
                }
                return;
            case 1:
                D0.g gVar = (D0.g) this.f345b;
                if (i6 - i4 > 0) {
                    i1.d dVar2 = gVar.f565g0;
                    float f6 = dVar2.f13265i;
                    float f7 = dVar2.f13266j;
                    if (f6 != 0.0f) {
                        gVar.f566h0.setScrollXModel(f6);
                    }
                    if (f7 != 0.0f) {
                        gVar.f566h0.setScrollYModel(f7);
                    }
                    gVar.f566h0.removeOnLayoutChangeListener(this);
                    return;
                }
                return;
            case 2:
                throw null;
            default:
                SearchView searchView = (SearchView) this.f345b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2556D;
                View view2 = searchView.f2564L;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f2558F.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a4 = M0.a(searchView);
                    int dimensionPixelSize = searchView.f2578d0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a4 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
