package H;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050z {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f837a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f838b;
    public WeakReference c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f837a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a4 = a(viewGroup.getChildAt(childCount));
                if (a4 != null) {
                    return a4;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
