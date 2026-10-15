package l1;

import C0.i0;
import C0.q0;
import C0.s0;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o1.C1881r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13949a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f13950b;
    public final Object c;
    public final /* synthetic */ Object d;

    public e(InsertProjectLayout insertProjectLayout, Context context, String str) {
        this.d = insertProjectLayout;
        this.c = context;
        this.f13950b = str;
    }

    public e(f fVar, String str, C1510e1 c1510e1) {
        this.d = fVar;
        this.f13950b = str;
        this.c = c1510e1;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean z4;
        boolean z5;
        File file;
        switch (this.f13949a) {
            case 0:
                f fVar = (f) this.d;
                if (fVar.f13955a == null) {
                    fVar.c();
                }
                ArrayList arrayList = new ArrayList();
                String str = this.f13950b;
                if (TextUtils.isEmpty(str)) {
                    arrayList.addAll(fVar.f13955a);
                } else {
                    String[] split = str.toLowerCase().split("[\\W]");
                    ArrayList arrayList2 = fVar.f13955a;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        C1797d c1797d = (C1797d) obj;
                        int length = split.length;
                        int i5 = 0;
                        boolean z6 = false;
                        while (true) {
                            if (i5 < length) {
                                String str2 = split[i5];
                                String[] strArr = c1797d.f13948i;
                                int length2 = strArr.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length2) {
                                        z4 = z6;
                                        z5 = false;
                                    } else if (strArr[i6].contains(str2)) {
                                        z5 = true;
                                        z4 = true;
                                    } else {
                                        i6++;
                                    }
                                }
                                if (z5) {
                                    i5++;
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                            }
                        }
                        if (z6) {
                            arrayList.add(c1797d);
                        }
                    }
                }
                Collections.sort(arrayList, new i0(3));
                return arrayList;
            default:
                Context context = (Context) this.c;
                ArrayList arrayList3 = new ArrayList();
                try {
                    file = new File(i1.c.g(context));
                } catch (Throwable unused) {
                }
                if (!file.exists()) {
                    throw new Throwable();
                }
                String[] list = file.list();
                if (list == null) {
                    throw new Throwable();
                }
                for (String str3 : list) {
                    if (!Objects.equals(str3, this.f13950b) && !str3.startsWith(".")) {
                        try {
                            i1.d e4 = i1.c.e(context, str3);
                            if (!e4.f13263g.f1475t.isEmpty()) {
                                arrayList3.add(e4);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return arrayList3;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f13949a) {
            case 0:
                List list = (List) obj;
                super.onPostExecute(list);
                f fVar = (f) this.d;
                e eVar = fVar.c;
                int i4 = 0;
                if (eVar != null) {
                    fVar.d = eVar;
                    fVar.c = null;
                    eVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                    return;
                }
                fVar.d = null;
                C1510e1 c1510e1 = (C1510e1) this.c;
                if (c1510e1 != null) {
                    q0 q0Var = (q0) ((s0) c1510e1.f11915q).f392h;
                    q0Var.f369e = list;
                    View view = (View) ((s0) q0Var.f370f).f390f;
                    if (list != null && list.size() != 0) {
                        i4 = 8;
                    }
                    view.setVisibility(i4);
                    q0Var.d();
                    ((View) c1510e1.f11914p).setVisibility(8);
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                InsertProjectLayout insertProjectLayout = (InsertProjectLayout) this.d;
                insertProjectLayout.f3634o.removeCallbacks(insertProjectLayout.f3641v);
                insertProjectLayout.f3641v = null;
                insertProjectLayout.f3634o.setVisibility(8);
                C1881r c1881r = insertProjectLayout.f3635p;
                c1881r.d = arrayList;
                Collections.sort(arrayList, new i0(5));
                c1881r.d();
                if (arrayList.isEmpty()) {
                    insertProjectLayout.f3638s.setVisibility(0);
                    return;
                }
                return;
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        switch (this.f13949a) {
            case 1:
                InsertProjectLayout insertProjectLayout = (InsertProjectLayout) this.d;
                insertProjectLayout.f3634o.postDelayed(insertProjectLayout.f3641v, 2000L);
                return;
            default:
                super.onPreExecute();
                return;
        }
    }
}
