package K;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: o, reason: collision with root package name */
    public boolean f1037o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1038p;

    /* renamed from: q, reason: collision with root package name */
    public Cursor f1039q;

    /* renamed from: r, reason: collision with root package name */
    public Context f1040r;

    /* renamed from: s, reason: collision with root package name */
    public int f1041s;

    /* renamed from: t, reason: collision with root package name */
    public a f1042t;

    /* renamed from: u, reason: collision with root package name */
    public b f1043u;

    /* renamed from: v, reason: collision with root package name */
    public d f1044v;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1039q;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1042t;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1043u;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1039q = cursor;
            if (cursor != null) {
                a aVar2 = this.f1042t;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1043u;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1041s = cursor.getColumnIndexOrThrow("_id");
                this.f1037o = true;
                notifyDataSetChanged();
            } else {
                this.f1041s = -1;
                this.f1037o = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1037o || (cursor = this.f1039q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f1037o) {
            return null;
        }
        this.f1039q.moveToPosition(i4);
        if (view == null) {
            w0 w0Var = (w0) this;
            view = w0Var.y.inflate(w0Var.f13854x, viewGroup, false);
        }
        a(view, this.f1039q);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [K.d, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1044v == null) {
            ?? filter = new Filter();
            filter.f1045a = this;
            this.f1044v = filter;
        }
        return this.f1044v;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f1037o || (cursor = this.f1039q) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f1039q;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f1037o && (cursor = this.f1039q) != null && cursor.moveToPosition(i4)) {
            return this.f1039q.getLong(this.f1041s);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f1037o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1039q.moveToPosition(i4)) {
            throw new IllegalStateException(U.a.i("couldn't move cursor to position ", i4));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        a(view, this.f1039q);
        return view;
    }
}
